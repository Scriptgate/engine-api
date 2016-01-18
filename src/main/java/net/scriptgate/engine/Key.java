package net.scriptgate.engine;

public class Key {

    public final Integer keyCode;
    public final String keyName;

    public Key(Integer keyCode, String keyName) {
        this.keyCode = keyCode;
        this.keyName = keyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Key key = (Key) o;

        if (keyCode != null ? !keyCode.equals(key.keyCode) : key.keyCode != null) return false;
        return keyName != null ? keyName.equals(key.keyName) : key.keyName == null;

    }

    @Override
    public int hashCode() {
        int result = keyCode != null ? keyCode.hashCode() : 0;
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
