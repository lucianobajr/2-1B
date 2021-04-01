package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class Http {
   
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
    
        
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        int HTTP_COD_SUCESSO = 200;

        URL url = new URL("https://covid19-brazil-api.now.sh/api/report/v1");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        if (con.getResponseCode() != HTTP_COD_SUCESSO) {
                throw new RuntimeException("HTTP error code : "+ con.getResponseCode());
        }
        
        BufferedReader resposta = new BufferedReader(new InputStreamReader((con.getInputStream())));
        String jsonEmString = converteJsonEmString(resposta);
        System.out.println(jsonEmString);
    }
    
}
