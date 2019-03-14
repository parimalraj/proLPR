package io.java.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:4200")
public class TopicController {
	@Autowired
	private TopicService topicservice;
   
	@GetMapping("api/topics")
	public List<Topic> getAllTopics(){
		return topicservice.getAllTopics();	
	}

	@RequestMapping("api/topics/{id}")
	public List getTopic(@PathVariable String id) {
		return (List)topicservice.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="api/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}
}
