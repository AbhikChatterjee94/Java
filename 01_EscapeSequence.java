class EscapeSequence
{
	public static void main(String[] args)
	{
		// \t --> space
		// \n --> next line
		// \' \' --> ' '
		// \" \" --> " "
		
		System.out.println("1)\"hello\"\t\'world\'");
		System.out.println("2)\'hello\'\t\"world\"");
		System.out.println("3)\"hello\"\n\'world\'");
		System.out.println("4)\'hello\'\n\"world\"");
		System.out.println("5)\"Amity\"\t\'Computar\'\tAcademy");
		System.out.println("6)Name\tRoll\tCourse\tMarks\tGrade\nRam\t1\tC\t90\tAA\nShyam\t2\tc++\t80\tA+");
	}
}