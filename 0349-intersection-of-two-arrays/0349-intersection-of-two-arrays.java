class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ansList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                ansList.add(nums1[i]);
                i++;
                j++;

                while (i < nums1.length && nums1[i] == nums1[i - 1]) {
                    i++;
                }
                while (j < nums2.length && nums2[j] == nums2[j - 1]) {
                    j++;
                }
            }
        }

        // Convert ArrayList to array
        int[] ansArray = new int[ansList.size()];
        for (int k = 0; k < ansList.size(); k++) {
            ansArray[k] = ansList.get(k);
        }

        return ansArray;
    }
}
