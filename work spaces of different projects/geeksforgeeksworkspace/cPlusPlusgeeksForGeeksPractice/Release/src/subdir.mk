################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/binomialHeap.cpp \
../src/cPlusPlusgeeksForGeeksPractice.cpp 

OBJS += \
./src/binomialHeap.o \
./src/cPlusPlusgeeksForGeeksPractice.o 

CPP_DEPS += \
./src/binomialHeap.d \
./src/cPlusPlusgeeksForGeeksPractice.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C++ Compiler'
	g++ -O3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


