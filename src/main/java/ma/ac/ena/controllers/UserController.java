package ma.ac.ena.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.PostUpdate;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ac.ena.entities.Employee;
import ma.ac.ena.entities.User;
import ma.ac.ena.services.EmployeeService;
import ma.ac.ena.services.UserService;
import ma.ac.ena.services.UsersRolesService;
import ma.ac.ena.wrapper.Documentwrapper;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UsersRolesService usersRolesService;
	@Autowired
	private EmployeeService employeeService ;
	@Autowired
	private HttpSession session ; 


	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	/*@PostUpdate("/update/users/{idUser}")
	public User updateUser(@PathVariable long idUser) {
		User u = userService.findUserById(idUser);
		return userService.saveUser(user);
	}*/
	
	@GetMapping(value="/users")
	public List<User> findUsers(Model model){
		return userService.findAllUsers();
	}

	// @Secured(value = { "ROLE_ADMIN", "ROLE_SCOLARITE" })

	/*@RequestMapping(value = "/findUsers")
	public String g(Model model) {
		List<User> users = userService.findAllUsers();
		model.addAttribute("listUsers", users);
		return "users";
	}*/

	/*@RequestMapping(value = "/addRoleToUser")
	public void addRoleToUser(String username, String role) {
		usersRolesService.addRoleToUser(username, role);
	}*/

	// solution 1 A ameliorer
	@GetMapping("/userConnected")
	public User getLogedUser1(HttpSession session) {
		SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
		String username = securityContext.getAuthentication().getName();

		User user = new User();
		user = userService.findUserByUsername(username);
		return user;
	}

	// solution 3 A ameliorer
	@GetMapping("/getLogedUser")
	public Map<String, Object> getLogedUser(HttpSession session) {
		SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
		String username = securityContext.getAuthentication().getName();
		List<String> roles = new ArrayList<>();
		for (GrantedAuthority ga : securityContext.getAuthentication().getAuthorities()) {

			roles.add(ga.getAuthority());
		}
		Map<String, Object> params = new HashMap<>();
		params.put("username", username);
		params.put("roles", roles);

		return params;

		/*
		 * 
		 * 
		 * user = securityContext.getAuthentication() ; listRoles = user.getRoles() ;
		 * 
		 * foms.findByName().getRoles ;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}
	
	
	

	
	@GetMapping(path="/simple/envoie")
	public String employeeToEmployee(ModelMap modelMap , HttpSession session  ) {
		String username = ( (User ) session.getAttribute("user") ) .getUsername() ; 
		List<Employee> employees = employeeService.getAllUsersExeptMe(username) ; 

		modelMap.addAttribute("allEmployees", employees) ; 
		modelMap.addAttribute("documentWrapper" , new Documentwrapper()) ; 

		return "envoieForm" ; 
		
	}
	
	
	@GetMapping(path="/groupe/envoie")
	public String employeeToGroupe(ModelMap modelMap , HttpSession session  ) {
		String username = ( (User ) session.getAttribute("user") ) .getUsername() ; 
		List<Employee> employees = employeeService.getAllUsersExeptMe(username) ; 
		
		modelMap.addAttribute("allEmployees", employees.toArray()) ; 
		modelMap.addAttribute("documentWrapper" , new Documentwrapper()) ; 

		return "envoieGroupe" ; 
		
	}
	

	

}
