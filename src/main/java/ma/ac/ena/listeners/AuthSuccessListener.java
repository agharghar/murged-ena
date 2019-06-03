package ma.ac.ena.listeners;

import java.util.Set;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import ma.ac.ena.entities.Document;
import ma.ac.ena.entities.Employee;
import ma.ac.ena.repositories.EmployeeRepository;
import ma.ac.ena.repositories.EnvoieRepository;
import ma.ac.ena.repositories.UserRepository;

@Component
public class AuthSuccessListener implements ApplicationListener<AuthenticationSuccessEvent>{
	
	@Autowired
	private UserRepository userRepository ;
	@Autowired
	private HttpSession session;
	@Autowired
	private EnvoieRepository envoieRepository ; 
	@Autowired
	private EmployeeRepository employeeRepository ;
	
	@Override
	public void onApplicationEvent(AuthenticationSuccessEvent event ) {
		String username = ((UserDetails) event.getAuthentication().getPrincipal()).getUsername() ; 
		Set<Document> documentsNonLu = envoieRepository.findDocumentNonLu( ((Employee) employeeRepository.findByName(username)).getId() ) ; 
		
		session.setAttribute("user", userRepository.findByUsername(username));
		session.setAttribute("documentNonLu", documentsNonLu);
		

		
	} 
	
	
	
	
	
}
