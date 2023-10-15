package com.Practice.Mock;

class PassObject {
	int id;
	String Name;
	public PassObject(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}

public class ObjectPass {
//	public void modify(int id, String name,PassObject ob) {
//		ob.setId(id);
//		ob.setName(name);
//	}
	public void modify(PassObject ob) {
		ob.setId(103);
		ob.setName("Suraj");
		System.out.println(ob.getId()+" "+ob.getName());
	}
	public static void main(String[] args) {
		ObjectPass op = new ObjectPass();
		PassObject st = new PassObject(101,"Pradeep");
		System.out.println(st.getId()+" "+st.getName());
//		op.modify(102, "Abhinay", new PassObject(101,"Pradeep"));
		op.modify(new PassObject(104,"Kabeer"));
		System.out.println(new PassObject(106,"Manish").getId()+" "+new PassObject(1011,"Manish").getId()+" "+new PassObject(109,"Kanishk").getName()+" "+new PassObject(106,"Tanishk").getName());
	}
}
