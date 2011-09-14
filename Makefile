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

#
# Targets
#

all: $(CLASS_FILES)

%.class: %.scala
	$(SCALAC) $<

clean:
	-rm -f *.class

