package se.umu.cs.ads.a2;

import se.umu.cs.ads.a2.backend.ChordDHT;
import se.umu.cs.ads.a2.interfaces.MessengerDHT;
import se.umu.cs.ads.a2.types.NodeId;
import se.umu.cs.ads.a2.util.Util;

public class Main {

    public static void main(String[] args) {
        try {

            int param = -1;

            // Check the bit size to use in the network
            int bitSize = 240;
            if((param = Util.getNumFlagParam(args, "-m")) != -1) {
                bitSize = param;
            }

            // Check if the network should be connected to a remote node
            NodeId remoteId = null;
            if((param = Util.getNumFlagParam(args, "-r")) != -1) {
                String[] ipPort = args[param].split(":");
                if(ipPort.length == 2) {
                    remoteId = new NodeId(ipPort[0], Integer.parseInt(ipPort[1]), bitSize);
                } else {
                    Util.wrongUsage("The address specified, '"
                            + param
                            + "' is not valid for flag '"
                            + args[param-1]
                            + "'");
                }
            }

            // Check the number of nodes to add.
            int nrNodes = 10;
            if((param = Util.getNumFlagParam(args, "-n")) != -1) {
                nrNodes = param;
            }

            ChordDHT dht = new ChordDHT(bitSize);

            if(remoteId == null) {
                dht.initNetwork(nrNodes);
            } else {
                dht.initNetwork(nrNodes, remoteId);
            }

            if(Util.containsFlag(args, "-logic") != -1) {
                System.out.println("Found: -logic");
            }

            if(Util.containsFlag(args, "-perf") != -1) {
                System.out.println("Found: -perf");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
