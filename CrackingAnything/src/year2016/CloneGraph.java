package year2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import structure.UndirectedGraphNode;

public class CloneGraph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
        	return node;
        
        List<UndirectedGraphNode> list = new ArrayList<UndirectedGraphNode>();
        list.add(node);
        
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        map.put(node, new UndirectedGraphNode(node.label));
        
        while(!list.isEmpty()){
        	UndirectedGraphNode current = list.remove(0);
        	
        	for(UndirectedGraphNode item : current.neighbors){
        		if(!map.containsKey(item)){
        			UndirectedGraphNode copy = new UndirectedGraphNode(item.label);
        			map.get(current).neighbors.add(copy);
        			map.put(item, copy);
        			list.add(item);
        		} else {
        			map.get(current).neighbors.add(map.get(item));
        		}
        	}
        }
        
        return map.get(node);
    }
}
