package com.appleyk.relation;


import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.appleyk.node.Device;
import com.appleyk.node.Location;
@RelationshipEntity(type = "LocatedIn")

public class LocatedIn {
	@GraphId
	private Long id;
	@StartNode
	private Device startNode;
	@EndNode
	private Location endNode;
	
	public LocatedIn() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Device getStartNode() {
		return startNode;
	}

	public void setStartNode(Device startNode) {
		this.startNode = startNode;
	}

	public Location getEndNode() {
		return endNode;
	}

	public void setEndNode(Location endNode) {
		this.endNode = endNode;
	}

	
	
	
}