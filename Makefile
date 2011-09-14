#
# Macros
#

CLASS_FILES = \
  ComplexDriver.class \
  MyList.class \
  Scratch.class \
  Timer.class \
  FrenchDate.class \
  Newton.class \
  TailRecursion.class \

SCALAC = scalac

SCALAC_OPTS = 

#
# Targets
#

all: $(CLASS_FILES)

%.class: %.scala
	$(SCALAC) $(SCALAC_OPTS) $<

clean:
	-rm -f *.class

