package Database;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.DB;
import org.bson.Document;



public class DataB {
	public  static void method(){
	String uri = "mongodb://game:game@gamedb-shard-00-00-hyep4.mongodb.net:27017,gamedb-shard-00-01-hyep4.mongodb.net:27017,gamedb-shard-00-02-hyep4.mongodb.net:27017/<dbname>?ssl=true&replicaSet=GameDB-shard-0&authSource=admin&retryWrites=true&w=majority" ;
	MongoClientURI clientURI = new MongoClientURI(uri);
	MongoClient mongoClient = new MongoClient(clientURI);
	MongoDatabase mongoDatabase = mongoClient.getDatabase("GameChangeDB");
	MongoCollection collection = mongoDatabase.getCollection("Users");
	
	Document document = new Document("name","Maxim");
	
	collection.insertOne(document);
	}
}
