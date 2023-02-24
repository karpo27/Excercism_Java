import java.util.*;

class ProteinTranslator {
    public static LinkedHashMap<String, String> RESISTANCE_VALUE = new LinkedHashMap<>() {{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
        put("UAA", "STOP");
        put("UAG", "STOP");
        put("UGA", "STOP");
    }};

    static List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();
        List<String> codons = new ArrayList<>();
        String temp = "";
        int j = 1;

        for (int i = 0; i < rnaSequence.length(); i++){
            temp += rnaSequence.charAt(i);
            if (j == 3){
                codons.add(temp);
                temp = "";
                j = 1;
            } else {
                j += 1;
            }
        }
        System.out.println(codons);
        for (int k = 0; k < codons.size(); k++){
            if (!Objects.equals(RESISTANCE_VALUE.get(codons.get(k)), "STOP")){
                result.add(RESISTANCE_VALUE.get(codons.get(k)));
            } else {
                break;
            }
        }
        return result;
    }
}
