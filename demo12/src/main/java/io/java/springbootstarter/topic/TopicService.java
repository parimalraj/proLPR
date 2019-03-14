package io.java.springbootstarter.topic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class TopicService {
	private List<Topic> topics=Arrays.asList(
			new Topic("W132132","Complete","Complete","Complete","Waiting","Not Reached"),
			new Topic("W132133","Complete","Complete","Complete","Waiting","Abort")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public List getTopic(String id) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		//int i=0;
		String[] s=id.split(",");
		for(String s2:s)
			al.add(topics.stream().filter(t -> t.getId().equals(s2)).findFirst().get());
		
		
         return al;
	}
}
