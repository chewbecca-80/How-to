public static List<File> fillList(String directoryName) {

		File directory = new File(directoryName);

		List<File> fileList = new ArrayList<File>();
		// get all the files from a directory
		File[] fileArray = directory.listFiles();
		fileList.addAll(Arrays.asList(fileArray));

		for (File file : fileArray) {
			if (file.isFile()) {
				// System.out.println(file.getAbsolutePath());

			} else if (file.isDirectory()) {
				fileList.addAll(fillList(file.getAbsolutePath()));
			}
		}

		return fileList;

	}
