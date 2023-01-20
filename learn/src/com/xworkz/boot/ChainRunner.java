package com.xworkz.boot;

import com.xworkz.things.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		Chain chain = new Chain();
		System.out.println(chain.type);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.fresh);
		System.out.println(chain.stolen);
		System.out.println(chain.usedFor);
		System.out.println(chain.weight);
		System.out.println("-------------------------------------------");
		Chain chain1 = new Chain("gold");
		System.out.println(chain1.type);
		System.out.println(chain1.length);
		System.out.println(chain1.material);
		System.out.println(chain1.fresh);
		System.out.println(chain1.stolen);
		System.out.println(chain1.usedFor);
		System.out.println(chain1.weight);
		System.out.println("-------------------------------------------");
		Chain chain2 = new Chain("gold", 20);
		System.out.println(chain2.type);
		System.out.println(chain2.length);
		System.out.println(chain2.material);
		System.out.println(chain2.fresh);
		System.out.println(chain2.stolen);
		System.out.println(chain2.usedFor);
		System.out.println(chain2.weight);
		System.out.println("-------------------------------------------");
		Chain chain3 = new Chain("gold", 24.5d, 300);
		System.out.println(chain3.type);
		System.out.println(chain3.length);
		System.out.println(chain3.material);
		System.out.println(chain3.fresh);
		System.out.println(chain3.stolen);
		System.out.println(chain3.usedFor);
		System.out.println(chain3.weight);
		System.out.println("-------------------------------------------");
		Chain chain4 = new Chain("gold", 24.5d, 300, "gold & copper");
		System.out.println(chain4.type);
		System.out.println(chain4.length);
		System.out.println(chain4.material);
		System.out.println(chain4.fresh);
		System.out.println(chain4.stolen);
		System.out.println(chain4.usedFor);
		System.out.println(chain4.weight);
		System.out.println("-------------------------------------------");
		Chain chain5 = new Chain("gold", 24.5d, 300, "gold and copper", true);
		System.out.println(chain5.type);
		System.out.println(chain5.length);
		System.out.println(chain5.material);
		System.out.println(chain5.fresh);
		System.out.println(chain5.stolen);
		System.out.println(chain5.usedFor);
		System.out.println(chain5.weight);

	}

}
