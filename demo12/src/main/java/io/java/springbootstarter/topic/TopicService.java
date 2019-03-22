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
	Topic t1;
	String st1, st2, st3; 
//	public List<Topic> topics=Arrays.asList(
		//	t1
//			new Topic("W132133","Complete","Complete","Complete","Complete","Complete"),
//			new Topic("W132134","Complete","Complete","Complete","Complete","Complete"),
//			new Topic("W132135","Complete","Complete","Waiting","Not Reached","Not Reached"),
//			new Topic("W132136","Complete","Complete","Complete","Aborted","Aborted")
		//	);
	
	ArrayList<Topic> topics = new ArrayList<Topic>(); 	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public List getTopic(String id) {

		ArrayList al=new ArrayList();
		id=id.replaceAll("\\s","");
		String[] s=id.split(",");
		for(String h:s)
		{
			//topics.add(new Topic(h,"complete",st1,st2,st3,st3));
			topics.add(new Topic("Wer","complete","v","f","r","r"));
			topics.add(new Topic("Werr","complete","v1","f2","r3","r4"));
		}
		
		for(String s2:s)
			al.add(topics.stream().filter(t -> t.getId().equalsIgnoreCase(s2)).findFirst().get());
		
		
         return al;
	}
}
