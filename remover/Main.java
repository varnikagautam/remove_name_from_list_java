package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void removeOggy(ArrayList<String> names) 
    {
        String removestr = "oggy";
        
        for(int itr=names.size()-1; itr>=0; itr--)
			{
			   if(names.get(itr).contains(substr))
			   {
			       names.remove(itr);
			   }
			   else
                		System.out.println(names.get(itr));
        return;
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}
