package Algorithms.LevenshteinDistance;


/**
 * @implNote
 * <p>Let’s take two Strings x and y of lengths m and n respectively.
 * We can denote each String as x[1:m] and y[1:n].</p>
 *
 * <p>We know that at the end of the transformation, both Strings will be of equal length and have
 * matching characters at each position. So, if we consider the first character of each String,
 * we’ve got three options:</p>
 *<ul><li>
 * Substitution:
 * Determine the cost (D1) of substituting x[1] with y[1]. The cost of this step would be zero if both
 * characters are same. If not, then the cost would be one
 * After step 1.1, we know that both Strings start with the same character. Hence the total cost would
 * now be the sum of the cost of step 1.1 and the cost of transforming the rest of the String x[2:m] into y[2:n]
 *</li><li>
 * Insertion:
 * Insert a character in x to match the first character in y, the cost of this step would be one
 * After 2.1, we have processed one character from y. Hence the total cost would now be the sum
 * of the cost of step 2.1 (i.e., 1) and the cost of transforming the full x[1:m] to remaining y (y[2:n])
 *</li><li>
 * Deletion:
 * Delete the first character from x, the cost of this step would be one
 * After 3.1, we have processed one character from x, but the full y remains to be processed. The total
 * cost would be the sum of the cost of 3.1 (i.e., 1) and the cost of transforming remaining x to the full y
 * The next part of the solution is to figure out which option to choose out of these three. Since we do
 * not know which option would lead to minimum cost at the end, we must try all options and choose the best one.
 *</li></ul>
 */
public class LevenshteinDistance {

    public static int apply(CharSequence first, CharSequence second) {
        int distance = 0;
        int secondInd = 0;
        int firstInd;

        if (first == null || second == null) {
            throw new IllegalArgumentException();
        }

        int fLen = first.length();
        int sLen = second.length();

        if (fLen == 0) return sLen;
        if (sLen == 0) return fLen;

        if (first.equals(second)) return 0;


        if (fLen > sLen) {
            CharSequence temp = first;
            first = second;
            second = temp;

            int tmp = fLen;
            fLen = sLen;
            sLen = tmp;
        }

        for (firstInd = 0; (secondInd < sLen); ) {
            if (firstInd < fLen) {
                if (first.charAt(firstInd) == second.charAt(secondInd)) {
                    firstInd++;
                    secondInd++;
                } else {
                    secondInd++;
                    distance++;
                    if (firstInd + 1 < fLen && secondInd < sLen) {
                        if (first.charAt(firstInd + 1) == second.charAt(secondInd)) {
                            firstInd++;
                        }
                    }
                }
            } else {
                distance++;
                secondInd ++;
            }
        }
//        if (fLen != firstInd && fLen != sLen) { distance += (fLen - firstInd); }
//        return distance + (sLen - secondInd);
//        if (extraAtTheEnd) {
//            distance += ((fLen - firstInd) + (sLen - secondInd));
//        }
        return distance;
    }


}
