package net.scriptgate.engine;

public class Key {

    public final int keyCode;
    public final String keyName;

    public Key(int keyCode, String keyName) {
        this.keyCode = keyCode;
        this.keyName = keyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Key key = (Key) o;

        if (keyCode != key.keyCode) return false;
        return keyName != null ? keyName.equals(key.keyName) : key.keyName == null;

    }

    @Override
    public int hashCode() {
        int result = keyCode;
        result = 31 * result + (keyName != null ? keyName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Key{" +
                "keyCode=" + keyCode +
                ", keyName='" + keyName + '\'' +
                '}';
    }
}