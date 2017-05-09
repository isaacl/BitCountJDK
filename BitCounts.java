public class BitCounts {
  public static final int bitCountLong(long i) {
    // HD, Figure 5-2
    i = i - ((i >>> 1) & 0x5555555555555555L);
    i = (i & 0x3333333333333333L) + ((i >>> 2) & 0x3333333333333333L);
    i = (i + (i >>> 4)) & 0x0f0f0f0f0f0f0f0fL;
    i = i + (i >>> 8);
    i = i + (i >>> 16);
    i = i + (i >>> 32);
    return (int)i & 0x7f;
  }

  public static final int bitCountLongNew(long i)
  {
      i -= (i >>> 1) & 0x5555555555555555L;
      i = (i & 0x3333333333333333L) + ((i >>> 2) & 0x3333333333333333L);
      i = (i + (i >>> 4)) & 0x0f0f0f0f0f0f0f0fL;
      return (int)((i * 0x0101010101010101L) >>> 56);
  }

  public static final int bitCountInt(int i) {
      // HD, Figure 5-2
      i = i - ((i >>> 1) & 0x55555555);
      i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
      i = (i + (i >>> 4)) & 0x0f0f0f0f;
      i = i + (i >>> 8);
      i = i + (i >>> 16);
      return i & 0x3f;
  }


  public static final int bitCountIntNew(int i) {
      i -= (i >>> 1) & 0x55555555;
      i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
      i = (i + (i >>> 4)) & 0x0f0f0f0f;
      return (i * 0x01010101) >>> 24;
  }
}
