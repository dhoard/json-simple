package org.json.simple;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.json.simple.internal.TreeMapJSONObject;

public class JSONObjectTM extends JSONObject
{
	private static final long serialVersionUID = 1L;
	
	private TreeMapJSONObject jsonObject = null;
	
	public JSONObjectTM()
	{
		super();
		
		jsonObject = new TreeMapJSONObject();
	}
	
	@SuppressWarnings("rawtypes")
	public JSONObjectTM(Map map)
	{
		this();
		
		for (Object object : map.entrySet())
		{
			Entry entry = (Entry) object;
			jsonObject.put(entry.getKey(), entry.getValue());
		}
	}
	
	public Object put(Object object, Object value)
	{
		return jsonObject.put(object, value);
	}
	
	public void writeJSONString(Writer out) throws IOException
	{
		jsonObject.writeJSONString(out);
	}
	
	public String toJSONString()
	{
		return jsonObject.toJSONString();
	}
	
	public String toString()
	{
		return jsonObject.toString();
	}
	
	public boolean equals(Object o)
	{
		return jsonObject.equals(o);
	}
	
	public int hashCode()
	{
		return jsonObject.hashCode();
	}
	
	public int size()
	{
		return jsonObject.size();
	}
	
	public boolean isEmpty()
	{
		return jsonObject.isEmpty();
	}
	
	public Object get(Object key)
	{
		return jsonObject.get(key);
	}
	
	public boolean containsKey(Object key)
	{
		return jsonObject.containsKey(key);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void putAll(Map m)
	{
		jsonObject.putAll(m);
	}
	
	public Object remove(Object key)
	{
		return jsonObject.remove(key);
	}
	
	public void clear()
	{
		jsonObject.clear();
	}
	
	public boolean containsValue(Object value)
	{
		return jsonObject.containsValue(value);
	}
	
	@SuppressWarnings("rawtypes")
	public Set keySet()
	{
		return jsonObject.keySet();
	}
	
	@SuppressWarnings("rawtypes")
	public Collection values()
	{
		return jsonObject.values();
	}
	
	@SuppressWarnings("rawtypes")
	public Set entrySet()
	{
		return jsonObject.entrySet();
	}
	
	@SuppressWarnings("unchecked")
	public Object getOrDefault(Object key, Object defaultValue)
	{
		return jsonObject.getOrDefault(key, defaultValue);
	}
	
	@SuppressWarnings("unchecked")
	public Object putIfAbsent(Object key, Object value)
	{
		return jsonObject.putIfAbsent(key, value);
	}
	
	public boolean remove(Object key, Object value)
	{
		return jsonObject.remove(key, value);
	}
	
	@SuppressWarnings("unchecked")
	public boolean replace(Object key, Object oldValue, Object newValue)
	{
		return jsonObject.replace(key, oldValue, newValue);
	}
	
	@SuppressWarnings("unchecked")
	public Object replace(Object key, Object value)
	{
		return jsonObject.replace(key, value);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object computeIfAbsent(Object key, Function mappingFunction)
	{
		return jsonObject.computeIfAbsent(key, mappingFunction);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object computeIfPresent(Object key, BiFunction remappingFunction)
	{
		return jsonObject.computeIfPresent(key, remappingFunction);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object compute(Object key, BiFunction remappingFunction)
	{
		return jsonObject.compute(key, remappingFunction);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object merge(Object key, Object value, BiFunction remappingFunction)
	{
		return jsonObject.merge(key, value, remappingFunction);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void forEach(BiConsumer action)
	{
		jsonObject.forEach(action);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void replaceAll(BiFunction function)
	{
		jsonObject.replaceAll(function);
	}
	
	public Object clone()
	{
		return jsonObject.clone();
	}
}
