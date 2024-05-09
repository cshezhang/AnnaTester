import java.security.MessageDigest;

class Foo {
  public byte[] calculateHash(byte[] data) throws Exception {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(data);
    return md.digest();
  }
}
