

import SwiftUI
import shared

@main
struct iOSApp: App {
    
    let movieSDK = MovieSDK()
    
	var body: some Scene {
		WindowGroup {
            MovieScreen(viewModel: .init(movieSDK: movieSDK))
		}
	}
}
