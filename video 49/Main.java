import java.util.HashMap;



public class Main
{
    public static void main(String[] args) 
    {
        
        HashMap<String, String> map = new HashMap<>();

        map.put("Mohammad", "Java course");
        // map.put("Mohammad", "C course");
        map.put("Ahmad", "C course");
        map.put("Mahdi", "Java course");

        //System.out.println(map);


        //System.out.println(map.get("Mohammad"));
        //System.out.println(map.get("Ali"));


        //System.out.println(map.values());
        //System.out.println(map.keySet());
        // for (String key: map.keySet())
        //     System.out.println("" + key + ": " + map.get(key));
        
        // for (var hold: map)
        //     System.out.println(hold);


        // System.out.println(map.size());



        // map.replace("Mahdi", "php course");
        // System.out.println(map);

        // map.replace("Mohammad", "Java course", "php course");
        // System.out.println(map);



        // map.putIfAbsent("Mahdi", "python course");
        // System.out.println(map);
        // map.putIfAbsent("Ali", "python course");
        // System.out.println(map);


        // map.remove("Ali");
        // System.out.println(map);
        // map.putIfAbsent("Ali", "python course");
        // map.remove("Ali", "html course");
        // System.out.println(map);


        // System.out.println(map.getOrDefault("Hamed", "nabudesh !"));


        // System.out.println(map.containsKey("Hamed"));
        // System.out.println(map.containsKey("Mahdi"));
        // System.out.println(map.containsValue("python course"));
        // System.out.println(map.containsValue("Java course"));
    }
}