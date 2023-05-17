import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.*;
class Main
{
    static int flag = 0;

    public static void addToCollection(Collection<String> C, String value)
    {
        C.add(value);
    }

    public static void addToMap(Map<String, Collection<String>> userMap, String key, Collection<String> C)
    {
        if(userMap.size() > 0)
        {    
             userMap.forEach(
                 (k, v)->
                 {
                     if(k == key)
                     {
                         C.forEach((elem) -> {
                             v.add(elem);
                         });
                     }
                     else
                     {
                         flag = 1;
                     }
        
                 }
             );
        }
        else if(flag == 1 || userMap.size() == 0)
        {
            userMap.put(key, C);
        }
    }

    public static void printMap(Map<String, Collection<String> > userMap)
    {
        userMap.forEach((k, v) -> {
            System.out.println("key " + k  + " Value " + v);
        });
    }
    public static void sortcol( List <String> C)
    {
        Collections.sort(C);
        
    }

    public static void main(String []args)
    {
        Map<String, Collection<String> > userMap = new HashMap<>();

        List<String> a = new LinkedList<>();
        List<String> b = new LinkedList<>();      
        List<String> c = new LinkedList<>();
    

        addToCollection(a, "Apple");
        addToCollection(a, "Apress");
        sortcol(a);
        
        addToCollection(b, "Book");
        addToCollection(b, "Ball");
        sortcol(b);

        addToCollection(c, "CC");
        addToCollection(c, "Cat");
        sortcol(c);

        addToMap(userMap, "A", a);
        addToMap(userMap, "A", b);
        addToMap(userMap, "C", c);

        printMap(userMap);

    }


}



