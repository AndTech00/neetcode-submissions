class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        result.add(prevRow);

        for(int i = 1 ; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int k = 0; k < prevRow.size() - 1; k++){
                    row.add(prevRow.get(k) + prevRow.get(k+1));
            }    
            row.add(1);
            result.add(row);
            prevRow = row;
        }
            return result;
        }
    }