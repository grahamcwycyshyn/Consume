package co.grandcircus.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.consume.model.CompleteResponse;
import co.grandcircus.consume.model.TinyResponse;

@Controller
public class ConsumeController {

	@Autowired
	private ConsumeService service;
	
	@RequestMapping("/")
	public ModelAndView tinies() {
		TinyResponse response = service.getTiny();
		ModelAndView mav = new ModelAndView("tiny-list");
		mav.addObject("tinies", response.getTiny());
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		CompleteResponse response = service.getComplete();
		ModelAndView mav = new ModelAndView("complete-list");
		mav.addObject("completes", response.getComplete());
		return mav;
	}
}
