package framework;

public interface Product extends Cloneable {
	// 「使う」ためのメソッド。使うが何を意味するかはサブクラスの実装に任されている
	public abstract void use(String s);
	// インスタンスの複製を行う
	public abstract Product createClone();
}
