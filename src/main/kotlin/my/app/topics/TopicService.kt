package my.app.topics

import org.springframework.stereotype.Service

@Service
class TopicService {
	
	val topics = mutableListOf(Topic("First", 1, "First topic"),Topic("Second", 2, "Second topic"),
			Topic("Third", 3, "Third topic"));
	
	fun getAllTopics():List<Topic>{
		return topics;
	}
	
	fun getTopic(id:Long):Topic{
		return topics.filter { t -> t.id.equals(id) }.first()
	}
	
	fun addTopic(topic:Topic):List<Topic>{
		topics.add(topic)
		return topics
	}
	
	fun updateTopic(topic:Topic, id : Long):List<Topic>{
		for(i in 0..topics.size-1){
			var t = topics.get(i)
			if(t.id.equals(id)){
				topics.set(i,topic)
				break
			}
		}
		return topics
	}
	
	fun deleteTopic(id:Long):List<Topic>{
		for(i in 0..topics.size-1){
			var t = topics.get(i)
			if(t.id.equals(id)){
				topics.remove(t)
				break
			}
		}
		return topics
	}
}