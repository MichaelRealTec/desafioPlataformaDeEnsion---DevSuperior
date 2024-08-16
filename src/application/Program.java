package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		// Desafio: Plataforma de ensino - Dev Superior
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		int n;
		char type;
		String title;
		String url;
		int seconds;
		String description;
		int questionCount;
		
		System.out.print("Quantas aulas tem o curso? ");
		n = sc.nextInt();
		System.out.println();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados da "+i+"a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			type = sc.next().charAt(0);
			if(type == 'c') {
				sc.nextLine();
				System.out.print("Título: ");
				title = sc.nextLine();
				System.out.print("URL do vídeo: ");
				url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				seconds = sc.nextInt();
				Lesson video = new Video(title, url, seconds);
				list.add(video);
				System.out.println();
				
			} else if (type == 't') {
				sc.nextLine();
				System.out.print("Título: ");
				title = sc.nextLine();
				System.out.print("Descrição: ");
				description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				questionCount = sc.nextInt();
				Lesson task = new Task(title, description, questionCount);
				list.add(task);
				System.out.println();
			} 
		}
		int sum = 0;
		for(Lesson object : list) {
			sum += object.duration();
		}
		
		System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos",sum);
		
		sc.close();
	}

}
