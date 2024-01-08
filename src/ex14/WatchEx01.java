package ex14;

import java.nio.file.*;

public class WatchEx01 {

    public static void main(String[] args) throws Exception {
        // 감지할 디렉토리 경로
        Path directoryPath = Path.of("D:/");

        // WatchService 생성
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // 디렉토리를 감시하도록 WatchKey 등록
        directoryPath.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

        // 무한 루프를 통해 변경 사항을 감지
        while (true) {
            WatchKey key = watchService.take(); // 이벤트를 기다림

            // 감지된 이벤트 처리
            for (WatchEvent<?> event : key.pollEvents()) {
                if (event.kind() == StandardWatchEventKinds.OVERFLOW) {
                    continue;
                }

                // 변경된 파일의 경로 출력
                Path changedFilePath = (Path) event.context();
                System.out.println("Changed: " + directoryPath.resolve(changedFilePath));
            }

            // WatchKey 초기화
            boolean reset = key.reset();
            if (!reset) {
                // 감시 중단됨
                break;
            }
        }
    }
}