package ru.netology.poster;

public class PosterManager {

    private PosterItem[] items = new PosterItem[0];
    private int posterLimit = 10;

    public PosterManager() {
    }

    public PosterManager(int posterLimit) {
        this.posterLimit = posterLimit;
    }

    public void addPoster(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast() {
        int resultLength;
        if (items.length <= posterLimit) {
            resultLength = items.length;
        } else {
            resultLength = posterLimit;
        }
        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - i - 1];
        }
        return result;
    }
}
