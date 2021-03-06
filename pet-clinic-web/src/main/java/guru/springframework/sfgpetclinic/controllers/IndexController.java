package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@RequestMapping({"/", "", "index", "index.html"})
	public String index() {
		log.debug("[IndexController] - index has been called");
		
		return "index";
	}
	
	@RequestMapping("/oups")
	public String oupsHandler() {
		log.debug("[IndexController] - oupsHandler has been called");
		
		return "notimplemented";
	}
}
