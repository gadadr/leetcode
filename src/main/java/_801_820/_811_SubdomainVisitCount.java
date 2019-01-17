package _801_820;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _811_SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countPairs = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] countPair = cpdomain.split(" ");
            int count = Integer.valueOf(countPair[0]);
            String[] domains = countPair[1].split("\\.");

            for (int i=0; i<domains.length; i++) {
                StringBuilder fullDomainBuilder = new StringBuilder(domains[i]);
                for (int j=i+1; j<domains.length; j++) {
                    fullDomainBuilder.append("." + domains[j]);
                }
                String fullDomain = fullDomainBuilder.toString();
                countPairs.put(fullDomain, countPairs.getOrDefault(fullDomain, 0) + count);
            }
        }

        List<String> allDomainPairsCount = new ArrayList<>();
        for(String key : countPairs.keySet()) {
            allDomainPairsCount.add(countPairs.get(key) + " " + key);
        }
        return allDomainPairsCount;
    }
}
