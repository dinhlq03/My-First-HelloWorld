package org.hm.firstapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dqle on 1/6/2018.
 */
public class MyTest {
    List<Block> blockChain = new ArrayList<>();
    public static void main(String [] abc) {

        String[] genesisTransactions = {"Le Dinh", "Hai Nguyen"};
        Block genesisBlock = new Block(0, genesisTransactions);

        System.out.println("Hash of genesisBlock");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("");
        System.out.println("Hash of block 2");

        String[] block2Transactions = {"dinh send 2 bitcoin to Hai", "Hai has 15 bitcoins"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        System.out.println(block2.getBlockHash());

        System.out.println("");
        System.out.println("Hash of block 3");

        String[] block3Transactions = {"Dinh buy 10 bitcoins", "Hai sale 1 bitcoin"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        System.out.println(block3.getBlockHash());

        System.out.println("");

        String[] block4Transactions = {"Dinh buy 100 bitcoins", "Hai buy 10 bitcoins"};
        Block block4 = new Block(block3.getBlockHash(), block4Transactions);
        System.out.println(block4.getBlockHash());
        System.out.println("");

        String[] block5Transactions = {"Dinh buy 1006 bitcoins", "Hai buy 100 bitcoins"};
        Block block5 = new Block(block4.getBlockHash(), block5Transactions);
        System.out.println(block5.getBlockHash());
        System.out.println("");
    }
}
