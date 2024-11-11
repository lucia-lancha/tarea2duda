import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String url = "https://raw.githubusercontent.com/jeffreylancaster/game-of-thrones/refs/heads/master/data/characters.json";
        leerJSON(url);
    }

    public static void leerJSON(String urlString) throws IOException {
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .build();


            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String jsonResponse = response.body();


            Gson gson = new Gson();
            Type responseType = new TypeToken<CharactersJson>(){}.getType();
            CharactersJson charactersJson = gson.fromJson(jsonResponse, responseType);

            List<Personajes> personajesList = charactersJson.getCharacters();

            System.out.println("Personajes deserializados:");
            for (Personajes personaje : personajesList) {
                System.out.println(personaje.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}