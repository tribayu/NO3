import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class NO3 {
 public static void NO3(String[] args) {
     String url = "https:/dummyyjson.com/product";
     String consID = "1234567";
     String user_key = "faY738sH";

     try {
         String jsonResponse = fetcData(url, consID, user_key);
         int[] data = parseData(jsonResponse);
         System.out.println("data sebelum diurutkan:");
         printArray(data);

         selectionSort(data);

         System.out.println("data setelah di  urutkan:");
         printArray(data)
     } catch (IIOException e){
         e.printStackTrace();
     }
 }

    private static int[] parseData(String jsonResponse) {
    }

    public static String fetcData(String url, String consID, String userkey) throws IOException {
     URL apiUrl = new URL(url);
     HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
     connection.setRequestMethod("GET");
     connection.setRequestProperty("x-cons-id", consID);
     connection.setRequestProperty("user-key", userkey);

     BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
     StringBuilder response = new StringBuilder();
     String line;
     while (line == String.valueOf(reader.readLine() != null)){
         response.append(line);
     }
     reader.close();
     connection.disconnect();

     return response.toString();
 }
 public static void selectionSort(int[] arr) {
     int n = arr.length;

     for (int i = 0; i < n - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < n; j++){
             if (arr[j] < arr[minIndex]){
                 minIndex = j;
             }
         }
         swap(arr, i, minIndex);
     }
 }

    public static void swap(int[] arr, int i, int j){
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;

    }
    public static void printArray(int[] arr){
     for (int i = 0; i < arr.length; i++){
         System.out.println(arr[i] + " ");
     }
        System.out.println();
    }
 }


