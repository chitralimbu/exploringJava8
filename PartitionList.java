public List<List<String>> partitionList(List<String> toPartition, int size){
  return IntStream.range(0, toPartitionl.size())
  .boxed()
  .collect(Collectors.groupingBy(s -> s % size)
  .values().stream()
  .map(s -> s.stream().map(i -> toPartition.get(i)).collect(Collectors.toList()))
  .collect(Collectors.toList());
}
