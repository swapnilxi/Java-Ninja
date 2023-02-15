package javaDSA2;

public class Searchin2DMatrix {
    int i = 0, j = matrix[0].length - 1;
    while(i < matrix.length && j >= 0) {
      if(matrix[i][j] == target)
        return true;
      else if(matrix[i][j] > target)
        j --;
      else if(matrix[i][j] < target)
        i ++;
    }
    return false;
  }
}
