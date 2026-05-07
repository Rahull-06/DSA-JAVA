import java.util.*;

public class MaxUnitsOnTrack {
    public int maxUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;

        for (int[] boxType : boxTypes) {
            int boxesToLoad = Math.min(boxType[0], truckSize);
            totalUnits += boxesToLoad * boxType[1];
            truckSize -= boxesToLoad;

            if (truckSize == 0) {
                break;
            }
        }

        return totalUnits;
    }
}