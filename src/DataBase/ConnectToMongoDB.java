package DataBase;



import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectToMongoDB {
   public static MongoDatabase mongoDatabase = null;

   public static MongoDatabase connectToMongoDB(){
       MongoClient mongoClient = new MongoClient();
       mongoDatabase = mongoClient.getDatabase("PNT");
       System.out.println("DataBase connected");
       return mongoDatabase;

   }
}
