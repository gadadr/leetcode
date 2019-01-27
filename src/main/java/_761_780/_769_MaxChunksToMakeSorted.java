package _761_780;

public class _769_MaxChunksToMakeSorted {

    public int maxChunksToSorted(int[] arr) {
        //Set number of chunkcs to 0
        int chunks = 0;
        for (int i=0; i<arr.length; i++) {
            // Every iteration, increase chunks by 1
            chunks++;
            // array element is not in its right place
            if (arr[i] > i) {
                //store it and update if a bigger one comes along
                int x = arr[i];
                while (x>i) {
                    // keep incrementing i till you reach the largest element in the chunk.
                    // basically skip x number of elements, where x is the largest element of the chunk
                    i++;
                    if (arr[i] > x) {
                        x = arr[i];
                    }
                }
            }
        }
        return chunks;
    }
}
