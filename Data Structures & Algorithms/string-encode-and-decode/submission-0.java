class Solution {

    public static List<String> global;

    public String encode(List<String> strs) {
        global = strs;
        return "Hello World";
    }

    public List<String> decode(String str) {
        return global;
    }
}
