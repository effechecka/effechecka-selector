# effechecka-selector
Scala library for biodiversity selectors and uuids.  Used by prototypes http://effechecka.org and https://gimmefreshdata.github.io .

Biodiversity selectors specify a taxon list of interest, an area of interest expressed in wktString, and a way to express traits of interests. 

UUIDs for Biodiversity selectors can be calculated (or derived) from the selector itself. This way, no central location is needed to keep track of issued UUIDs and associated selector parameters. 


A snippet from test cases:
```scala
val selector = OccurrenceSelector(taxonSelector = "Animalia|Insecta", wktString = "ENVELOPE(-150,-50,40,10)")
val expectedUUID: String = "55e4b0a0-bcd9-566f-99bc-357439011d85"

UuidUtils.uuidFor(selector) should be(UUID.fromString(expectedUUID))
```

For more example usage, see the [test cases](../../tree/master/src/test/scala/org/effechecka/selector), https://github.com/jhpoelen/effechecka or https://github.com/bio-guoda/idigbio-spark .
