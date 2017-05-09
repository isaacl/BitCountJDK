class BitCountRunner {
    static final int MAX_INT = 1 << 14;
    static final long MAX_LONG = 1 << 14;

    int intIntrinsic() {
        int cnt = 0;
        for (int i = 0; i < MAX_INT; i++)
            cnt += Integer.bitCount(i);
        return cnt;
    }

    int intJDK() {
        int cnt = 0;
        for (int i = 0; i < MAX_INT; i++)
            cnt += BitCounts.bitCountInt(i);
        return cnt;
    }

    int intNew() {
        int cnt = 0;
        for (int i = 0; i < MAX_INT; i++)
            cnt += BitCounts.bitCountIntNew(i);
        return cnt;
    }


    int longIntrinsic() {
        int cnt = 0;
        for (long i = 0; i < MAX_LONG; i++)
            cnt += Long.bitCount(i);
        return cnt;
    }

    int longJDK() {
        int cnt = 0;
        for (long i = 0; i < MAX_LONG; i++)
            cnt += BitCounts.bitCountLong(i);
        return cnt;
    }

    int longNew() {
        int cnt = 0;
        for (long i = 0; i < MAX_LONG; i++)
            cnt += BitCounts.bitCountLongNew(i);
        return cnt;
    }
}
