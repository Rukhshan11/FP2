import com.google.gson.Gson;

public class TestApiJsonParsing {

   public static void main(String[] args) {
      
      
      // Create a String to hold your API response JSON
      // No need to actually call the API here
      //
      // Newer versions of Java support multiline Strings
      // This means we don't have to escape all the double quotes
      // This is a common feature in other languages too
      // Note how a multiline String starts and ends with 3 double quotes
      // More info; https://blogs.oracle.com/javamagazine/post/text-blocks-come-to-java
      //
      String data = """
                    {"lat":40.1742,"lon":-75.278,"timezone":"America/New_York","timezone_offset":-14400,"current":{"dt":1649800761,"sunrise":1649759243,"sunset":1649806556,"temp":294.92,"feels_like":294.35,"pressure":1018,"humidity":46,"dew_point":282.8,"uvi":0.58,"clouds":0,"visibility":10000,"wind_speed":3.6,"wind_deg":260,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}]},"daily":[{"dt":1649782800,"sunrise":1649759243,"sunset":1649806556,"moonrise":1649790660,"moonset":1649753040,"moon_phase":0.36,"temp":{"day":291.18,"min":281.74,"max":294.92,"night":286.61,"eve":294.04,"morn":282.1},"feels_like":{"day":290.45,"night":285.84,"eve":293.46,"morn":281.03},"pressure":1018,"humidity":54,"dew_point":281.88,"wind_speed":4.16,"wind_deg":324,"wind_gust":9.05,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":72,"pop":0.79,"rain":0.18,"uvi":6.16},{"dt":1649869200,"sunrise":1649845551,"sunset":1649893017,"moonrise":1649881020,"moonset":1649841120,"moon_phase":0.39,"temp":{"day":295.38,"min":284.56,"max":297.5,"night":292.29,"eve":294.43,"morn":285.3},"feels_like":{"day":295.15,"night":292.32,"eve":294.44,"morn":284.58},"pressure":1016,"humidity":57,"dew_point":286.52,"wind_speed":4.87,"wind_deg":218,"wind_gust":14.66,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":100,"pop":0.63,"rain":1.64,"uvi":6.21},{"dt":1649955600,"sunrise":1649931860,"sunset":1649979478,"moonrise":1649971500,"moonset":1649929020,"moon_phase":0.42,"temp":{"day":296.84,"min":285.41,"max":296.84,"night":285.41,"eve":286.92,"morn":289.67},"feels_like":{"day":296.75,"night":284.28,"eve":285.76,"morn":289.54},"pressure":1008,"humidity":57,"dew_point":287.87,"wind_speed":8.29,"wind_deg":282,"wind_gust":14.36,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":81,"pop":0.87,"rain":0.84,"uvi":6.11},{"dt":1650042000,"sunrise":1650018169,"sunset":1650065940,"moonrise":1650062040,"moonset":1650016860,"moon_phase":0.46,"temp":{"day":291.11,"min":282.24,"max":291.86,"night":286.94,"eve":287.73,"morn":282.24},"feels_like":{"day":289.64,"night":285.58,"eve":286.47,"morn":281.45},"pressure":1020,"humidity":26,"dew_point":271.41,"wind_speed":5.67,"wind_deg":197,"wind_gust":15.44,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":5.79},{"dt":1650128400,"sunrise":1650104479,"sunset":1650152401,"moonrise":1650152820,"moonset":1650104760,"moon_phase":0.5,"temp":{"day":285.8,"min":279.19,"max":289.59,"night":279.19,"eve":282.39,"morn":285.29},"feels_like":{"day":285.05,"night":275.82,"eve":279.97,"morn":284.05},"pressure":1010,"humidity":74,"dew_point":281.04,"wind_speed":7.33,"wind_deg":311,"wind_gust":17.23,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":82,"pop":0.74,"rain":1.37,"uvi":3.42},{"dt":1650214800,"sunrise":1650190790,"sunset":1650238863,"moonrise":1650243720,"moonset":1650192840,"moon_phase":0.53,"temp":{"day":284.51,"min":274.57,"max":285.22,"night":280.09,"eve":282.19,"morn":275.53},"feels_like":{"day":282.51,"night":280.09,"eve":281.32,"morn":271.54},"pressure":1022,"humidity":31,"dew_point":267.68,"wind_speed":4.41,"wind_deg":292,"wind_gust":9.6,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":5,"pop":0,"uvi":0.54},{"dt":1650301200,"sunrise":1650277102,"sunset":1650325325,"moonrise":1650334740,"moonset":1650281160,"moon_phase":0.57,"temp":{"day":287.73,"min":278.43,"max":287.73,"night":283.24,"eve":284.45,"morn":280.04},"feels_like":{"day":286.34,"night":282.39,"eve":282.94,"morn":279.36},"pressure":1022,"humidity":42,"dew_point":275.01,"wind_speed":5.62,"wind_deg":189,"wind_gust":12.69,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":92,"pop":0.7,"rain":0.98,"uvi":1},{"dt":1650387600,"sunrise":1650363415,"sunset":1650411787,"moonrise":1650425760,"moonset":1650369780,"moon_phase":0.61,"temp":{"day":285.61,"min":279.04,"max":285.99,"night":279.04,"eve":281.98,"morn":279.89},"feels_like":{"day":283.88,"night":275.36,"eve":279.07,"morn":276.38},"pressure":1016,"humidity":37,"dew_point":271.15,"wind_speed":8,"wind_deg":287,"wind_gust":13.95,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":24,"pop":1,"rain":7.32,"uvi":1}]}
                    """;
                    
      // Show me this parses
      // Be sure you submit all of your supporting classes as well   
      // This is all I need!                 
      Gson gson = new Gson();      
      Temperature t = gson.fromJson(data, Temperature.class);    
   }

}