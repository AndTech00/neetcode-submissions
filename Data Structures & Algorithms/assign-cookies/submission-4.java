class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l1 = 0;
        int l2 = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(l1 < g.length){
            while(l2 < s.length && s[l2] < g[l1]){
                l2++;
            }
            if(l2 == s.length) break;
            l1++;
            l2++;
        }
        return l1;
    }
}