This fork was created because ...

1. I changed JSONObject.put methods to convert Number types to BigDecimal for precision issues. (No Double, Long, Integer types)
2. I added JSONObjectTM, which derives from JSONObject, but has ordered key value pairs based on a TreeMap
3. I added JSONObjectLHM, which derives from JSONObject, but has ordered key value pairs based on a LinkedHashMap