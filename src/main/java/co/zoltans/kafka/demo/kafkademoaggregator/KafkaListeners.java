package co.zoltans.kafka.demo.kafkademoconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "kafka-demo", groupId = "kafka-demo-group-id-2")
  void listenMessage(String kafkaMessage) {
    System.out.println("Received Message in group kafka-demo-group-id-2: " + kafkaMessage);
  }
  
  @KafkaListener(topics = "kafka-demo-aggregated", groupId = "kafka-demo-aggregated-group-id-2")
  void listenMessageAggregated(String kafkaMessage) {
    System.out.println("Received Message in group kafka-demo-aggregated-group-id-2: " + kafkaMessage);
  }
}
