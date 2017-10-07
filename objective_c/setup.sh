function _print(){
    echo `date`":" $1 "..."
		}

		_print "Installing gcc compiler for objective C"

		sudo apt-get install gnustep gnustep-devel gobjc tree

		_print "Creating a sample test project structure"

		sample_dir="/tmp/iOS-Test-Project"
		sample_file="main.m"
		output_file="main"
		install_dir="~/bin"
		script_file="compileAndRunObjC"

		mkdir -p $sample_dir && cd $sample_dir

		echo '#import <Foundation/Foundation.h>' > $sample_file
		echo 'int main(int argc, char const *argv[]){' >> $sample_file
		echo '  NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];' >> $sample_file
		echo '  NSLog(@"<YO...Objective-C successfuly compiled in Linux :)>");' >> $sample_file
		echo '  [pool drain];' >> $sample_file
		echo '  return 0;' >> $sample_file
		echo '}' >> $sample_file

		_print "Added code to $sample_file in iOS-Testing-Project"
		_print "Compiling $sample_file"

		gcc `gnustep-config --objc-flags` -o $output_file $sample_file -L /GNUstep/System/Library/Libraries -lobjc -lgnustep-base
		./$output_file  # execute the compiled code
		tree $sample_dir

		_print "Adding 'compileAndRunObjc' to your system for easy compilation"

		mkdir $install_dir && cd $install_dir
		echo "gcc `gnustep-config --objc-flags` -o $1 $1.m -L /GNUstep/System/Library/Libraries -lobjc -lgnustep-base\n./$1" > $script_file
		chmod $script_file
		echo "export PATH=$HOME/scripts:$PATH" >> ~/.bashrc

		source ~/.bashrc
		tree $install_dir

		echo 'Following things have been added to your system:'
		echo 't1> gnustep'
		echo 't2> gobjc'
		echo "t3> $script_file"
		echo 'Use "compileAndRunObjC <file-name-without-dot-m>" to compile and run your objective c code'
