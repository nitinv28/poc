package boot.start.rest.applynow;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import boot.start.domain.applynow.ApplyNow;
import boot.start.domain.applynow.ApplyNowMap;
import boot.start.domain.applynow.Elements;
import boot.start.repository.applynow.ApplyNowMapServices;
import boot.start.repository.applynow.ApplyNowServices;
import boot.start.repository.applynow.ElementServices;

/**
 * Rest end point
 * @author nitin
 */
@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class ApplyNowController {

	@Autowired
	ApplyNowServices applyNowServices;
	
	@Autowired
	ApplyNowMapServices applyMapNowServices;
	
	@Autowired
	ElementServices elementServices;

	/**
	 * get API details
	 * @return
	 */
	@GetMapping("/api")
	public Object getApi(){
		return setDummyObject();
	}

	/**
	 * Submit details
	 * @param applyNow
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	@PostMapping("/apply_now")
	public Object setApplyNow(@RequestBody ArrayList<ApplyNowMap> applyNow) throws IllegalArgumentException, IllegalAccessException{
		
		System.out.println("applyNow"+applyNow.size());
		for(ApplyNowMap applyNowMap :applyNow){
			System.out.println(applyNowMap.getField());
			applyMapNowServices.save(applyNow);
		}
//		ApplyNowMap applyNowMap = new ApplyNowMap();
//		applyNowMap.setField("Name");
//		applyNowMap.setValue(applyNow.getName());
//		applyMapNowServices.save(applyNowMap);
//		
//		ApplyNowMap applyNowMap2 = new ApplyNowMap();
//		applyNowMap2.setField("Email");
//		applyNowMap2.setValue(applyNow.getEmail());
//		applyMapNowServices.save(applyNowMap2);
//		
//		ApplyNowMap applyNowMap3 = new ApplyNowMap();
//		applyNowMap3.setField("Mobile");
//		applyNowMap3.setValue(applyNow.getMobile());
//		applyMapNowServices.save(applyNowMap3);
//		
//		ApplyNowMap applyNowMap4 = new ApplyNowMap();
//		applyNowMap4.setField("Message");
//		applyNowMap4.setValue(applyNow.getMessage());
//		applyMapNowServices.save(applyNowMap4);
		
		
		//return null;
		return "ok";
		
	}

	/**
	 * get details by name
	 * @param name
	 * @return
	 */
	@GetMapping("get_details_by_name/{name}")
	public Object getApplyNow(@PathVariable String name){
		return applyNowServices.findByName(name);
	}


	/**
	 * upload the file
	 * @param file
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/upload1",method = RequestMethod.POST)
	public String FileUpload(@RequestParam("file" ) MultipartFile file, RedirectAttributes redirectAttributes) {

		String UPLOADED_FOLDER = "D://temp//";
		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:uploadStatus";
		}

		try {
			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

			redirectAttributes.addFlashAttribute("message",
					"You successfully uploaded '" + file.getOriginalFilename() + "'");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "redirect:/uploadStatus";
	}

	/**
	 * upload the file with form data
	 * @param applyNow
	 * @param file
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	public String singleFileUpload( ApplyNow applyNow, @RequestParam("file" ) MultipartFile file,
			RedirectAttributes redirectAttributes) {

		applyNowServices.save(applyNow);
		String UPLOADED_FOLDER = "D://temp//";
		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:uploadStatus";
		}

		try {
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

			redirectAttributes.addFlashAttribute("message",
					"You successfully uploaded '" + file.getOriginalFilename() + "'");

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/uploadStatus";
	}
	
	@GetMapping("/get_element")
	public List<Elements> getElements(){
		return elementServices.findAll();
	}

	/**
	 * dummy data
	 * @return
	 */
	public ApplyNow setDummyObject(){
		ApplyNow applyNow = new ApplyNow();
		applyNow.setEmail("nitin@greentechict.com");
		applyNow.setMessage("Welcome in gtc");
		applyNow.setMobile("999999999");
		applyNow.setName("mark");
		return applyNow;
	}
}
